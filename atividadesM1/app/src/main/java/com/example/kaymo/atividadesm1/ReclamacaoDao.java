package com.example.kaymo.atividadesm1;

import android.content.Context;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by kaymo on 23/04/2018.
 */

public class ReclamacaoDao {

    private static final String FILE_NAME = "reclamacoes.txt";

    private static ArrayList<Reclamação> bd;

    public static void salvar(Context context, Reclamação reclamação) {
        bd.add(reclamação);
        FileOutputStream outputStream;
        try {
            outputStream = context.openFileOutput(FILE_NAME, Context.MODE_APPEND);
            String line = reclamação.getCategoria() + ";" + reclamação.getDescricao() + ";";
            outputStream.write((line + System.getProperty("line.separator")).getBytes());
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Reclamação> getLista(Context context) {
        bd = new ArrayList<>();
        FileInputStream inputStream;
        try {
            inputStream = context.openFileInput(FILE_NAME);
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line;
            String[] lineSep;
            while ((line = bufferedReader.readLine()) != null) {
                lineSep = line.split(";");
                bd.add(new Reclamação(lineSep[0], lineSep[1]));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return bd;
    }

}
