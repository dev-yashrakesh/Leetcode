package leetcode;

public class MaxiumNumberOfWordsInSentence {

	
public int mostWordsFound(String[] sentences) {
        
  int temp=0;      
        for(int i=0;i<sentences.length;i++) {
        	int  count=1;
        	for(int j=0;j<sentences[i].length();j++) {
        		if(sentences[i].charAt(j)==' ') {
            		count++;
            	}
        	}
        	if(temp<count) {
        		temp=count;
        	}
        }
	return temp;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
