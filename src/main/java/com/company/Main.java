package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    private String userName = "rmiller";
    private String password = "14851485";
    private String url = "http://www.insidecellularworld.com/SalesPerfG.php";

    public static void main(String[] args) {
	// write your code here

        collectCellWorldData();
    }

    /**
     * collectCellWorldData() -
     *      collects the data from insidecellularworld.com and formats into desired output.
     */
    private static void collectCellWorldData() {
        Main main = new Main();

        main.openCellularWorld();

    }

    private void openCellularWorld() {
        //todo open webpage


        try {
            Document document = Jsoup.connect(url).get();
            String title = document.title();

            System.out.println(document);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            URL insideCellularWorld = new URL(url);
            BufferedReader in = new BufferedReader(new InputStreamReader(insideCellularWorld.openStream()));


            String inputLine;
            while ((inputLine = in.readLine()) != null){
                //System.out.println(inputLine);

            }
            in.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
