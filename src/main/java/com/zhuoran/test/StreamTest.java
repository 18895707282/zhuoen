package com.zhuoran.test;

import java.io.*;

/**
 * @author maao
 */
public class StreamTest {
    public static void main(String[] args) {
        inputStreamMethod("C:\\Users\\Administrator\\Desktop\\1.txt");
    }
    private static void inputStreamMethod(String file){
        InputStream is=null;
        try {
            is=new FileInputStream(new File(file));
            InputStreamReader inputStreamReader=new InputStreamReader(is);
            BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
            StringBuffer stringBuffer=new StringBuffer();
            String line="";
            while ((line=bufferedReader.readLine())!=null){
                stringBuffer.append(line+"\n");
            }
            System.out.println(stringBuffer.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(is!=null){
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
