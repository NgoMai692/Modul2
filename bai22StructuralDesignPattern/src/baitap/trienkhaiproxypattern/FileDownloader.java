package baitap.trienkhaiproxypattern;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class FileDownloader implements Downloader{
    @Override
    public void download(URL url,String path) {
        try{
            URLConnection hc = url.openConnection();
            hc.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
            System.out.println();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
