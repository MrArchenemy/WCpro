import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static Map<String, Integer> scan(String path)throws IOException
	{
		//��ȡ�ĵ��������е��ʷ���list��ͳ��
        InputStreamReader isr = new InputStreamReader(new FileInputStream(path));
        BufferedReader br = new BufferedReader(isr);
        String str=null;
        List<String> lists = new ArrayList<String>();  //�洢���˺󵥴ʵ��б�  
        while((str=br.readLine())!=null){
            String[] tmp = str.split("[^a-zA-Z-]");  //���˳�ֻ������ĸ��
            for(int i=0;i<tmp.length;i++){
                if(tmp[i].length()!=0)
                {
                	//�����̺��ߵĵ�δ���ӵĵ���ȥ������
                	if((tmp[i].substring(tmp[i].length()-1, tmp[i].length())).equals("-"))
                	{
                		if(tmp[i].length()!=1)//���ⵥ������ʱ������ַ�
                		{
                    		lists.add(tmp[i].substring(0, tmp[i].length()-1)); 
                		}
                	}
                	else
                	{
                		lists.add(tmp[i]); 
                	}
                }
            }
        }  
        isr.close();
        Map<String, Integer> wordsCount = new TreeMap<String,Integer>();  //�洢���ʼ�����Ϣ��keyֵΪ���ʣ�valueΪ������      
        //���ʵĴ�Ƶͳ��    
        for (String li : lists) {    
            if(wordsCount.get(li) != null){    
                wordsCount.put(li,wordsCount.get(li) + 1);    
            }else{    
                wordsCount.put(li,1);    
            }    
    
        }
        return wordsCount;
	}

}
