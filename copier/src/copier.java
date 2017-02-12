/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carlo
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class copier {    
    public static void main(String args[]) throws FileNotFoundException, IOException{
        File directory = new File("C:\\");
        process(directory);
        System.out.println("teliose");
    }
    public static void process(File directory) throws FileNotFoundException, IOException{        
        int length=0; 
        //System.out.println(directory.getAbsolutePath());
        File filenames[] = directory.listFiles();
        length = filenames.length;
        String path;
        
        
        for(int i=0;i < length ;i++){
            File dir = filenames[i];
            //System.out.println(dir.isDirectory());
            String filetype = dir.getName().substring(dir.getName().lastIndexOf(".")+1);
            if(!dir.isHidden()){
            //System.out.println(filetype);
            //System.out.println(dir.isFile());
            if(dir.isDirectory()) {                
                //System.out.println("------------------------");
                process(dir);
            }
            else if(filetype.equals("pdf")){
                //copy
               // System.out.println(dir.getName());
                path = directory.getAbsolutePath()+"\\"+dir.getName();
                //System.out.println(path);
                String name=dir.getName();
                copy(path,name);
            }
            else if(filetype.equals("doc")){
                //copy
                //System.out.println(dir.getName());
                path = directory.getAbsolutePath()+"\\"+dir.getName();
                //System.out.println(path);
                String name=dir.getName();
                copy(path,name);
            }
            else if(filetype.equals("docx")){
                //copy
                //System.out.println(dir.getName());
                path = directory.getAbsolutePath()+"\\"+dir.getName();
                //System.out.println(path);
                String name=dir.getName();
                copy(path,name);
            }
            else if(filetype.equals("xlsx")){
                //copy
                //System.out.println(dir.getName());
                path = directory.getAbsolutePath()+"\\"+dir.getName();
                //System.out.println(path);
                String name=dir.getName();
                copy(path,name);
            }
            else if(filetype.equals("xls")){
                //copy
                //System.out.println(dir.getName());
                path = directory.getAbsolutePath()+"\\"+dir.getName();
                //System.out.println(path);
                String name=dir.getName();
                copy(path,name);
            }
            else if(filetype.equals("pptx")){
                //copy
                //System.out.println(dir.getName());
                path = directory.getAbsolutePath()+"\\"+dir.getName();
                //System.out.println(path);
                String name=dir.getName();
                copy(path,name);
            }
            else if(filetype.equals("ppt")){
                //copy
                //System.out.println(dir.getName());
                path = directory.getAbsolutePath()+"\\"+dir.getName();
                //System.out.println(path);
                String name=dir.getName();
                copy(path,name);
            }
            
        }
        }
    }
    public static void copy(String path,String name) throws FileNotFoundException, IOException{
        FileInputStream fis  = new FileInputStream(path);
        String currentDir = new File(".").getAbsolutePath()+"\\"+name;
        FileOutputStream fos = new FileOutputStream(currentDir);
    try {
        byte[] buf = new byte[1024];
        int i = 0;
        while ((i = fis.read(buf)) != -1) {
            fos.write(buf, 0, i);
        }
    } 
    catch (IOException e) {
        
    }
        if (fis != null) fis.close();
        if (fos != null) fos.close();
    }
    
}
