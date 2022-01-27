package hackerRank;

import java.util.Hashtable;

public class HashTableMag {
	static void checkMagazine(String[] magazine, String[] note) {
		int present=1;
        if(note.length>magazine.length) {
        	System.out.println("No");
        }
        else {
        	Hashtable<String,Integer> hp=new Hashtable<>();
        	for(int i=0;i<magazine.length;i++) {
        		if(hp.containsKey(magazine[i])) {
        			Integer a=hp.get(magazine[i]);
        			hp.replace(magazine[i], ++a);
        		}
        		else {
        			hp.put(magazine[i], 1);
        		}
        	}
        	
        	for(int j=0;j<note.length;j++) {
        		if(hp.containsKey(note[j])) {
        			Integer b=hp.get(note[j]);
        			if(b<=0) {
        				present=0;
        				break;
        			}
        			else {
        				hp.replace(note[j],--b);
        			}
        		}
        		else {
        			present=0;
        			break;
        		}
        	}
        	
        	if(present==1)
        		System.out.println("YEs");
        	else
        		System.out.println("No");
        }


    }

   
    public static void main(String[] args) {
               int m = 6;

        int n = 5;

        String[] magazine = new String[m];

        String[] magazineItems = {"two","times","three","is","not","four"};

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = {"two","times","two","is","four"};

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        
    }
}
