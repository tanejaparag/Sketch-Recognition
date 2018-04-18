import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Collections;

public class DivideImage {

	private static final CopyOption REPLACE_EXISTING = null;

	public static void main(String[] args) {
		File file = new File("/Users/paragtaneja/AnacondaProjects/Sketch/Train1/");
		String[] names = file.list();
		int i = 1;
		
		int[] initial = {};
		int[] end = {};
		int [] amount = {};
		int least_number = 0;
		int max_number = 0;
		int parag;
		for(String name : names)
		{
			
		    if (new File("/Users/paragtaneja/AnacondaProjects/Sketch/Train1/").isDirectory())
		    {
		    		
		    		if(!name.matches(".DS_Store") && !name.matches("filelist.txt"))
		    		{
		    			
		    			//System.out.println(i + "---" + name);
		    			
		    			File dir = new File("/Users/paragtaneja/AnacondaProjects/Sketch/Test1/" + name);
		    			dir.mkdir();
		    			
		    			if(i < 251)
		    			{
		    				File file1 = new File("/Users/paragtaneja/AnacondaProjects/Sketch/Train1/"+name + "/");
		    				String[] name_of_file = file1.list();
		    				int count = 0;
		    				parag = 0;
		    				for(String temp_name : name_of_file)
		    				{
		    					
		    					if(!temp_name.matches(".DS_Store"))
		    						{
		    							//System.out.print(temp_name);
		    							count++ ;
		    							
		    							temp_name = temp_name.replaceAll(".png", "");
		    							int a = Integer.parseInt(temp_name);
		    							if(parag == 0)
		    							{
		    								least_number = a;
		    								parag++;
		    							}
		    							
		    							if(a <= least_number)
		    								least_number = a;
		    							
		    							if(a > max_number)
		    								max_number = a;
		    							
		    						}
		    				}
		    				System.out.println(name+","+count + "," + least_number+ ","+ max_number);
		    				ArrayList<Integer> list = new ArrayList<Integer>();
			    	        for (int j=least_number; j<=max_number; j++) {
			    	            list.add(new Integer(j));
			    	        }
			    	        Collections.shuffle(list);
			    	        for (int j=0; j<32; j++) {
			    	            //System.out.println(list.get(j));
			    	            File source= new File("/Users/paragtaneja/AnacondaProjects/Sketch/Train1/" + name + "/" + list.get(j) + ".png");
			    	            File dest = new File("/Users/paragtaneja/AnacondaProjects/Sketch/Test1/" + name + "/" + list.get(j) + ".png");
			    	            try {
									Files.copy(source.toPath(), dest.toPath());
								} catch (IOException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
									System.out.println(e.getMessage());
								}
			    	            
			    	        }
		    			}
		    			
		    			
		    			i++;
		    		}
		    		
		    		//System.out.print("\n\n");
		    }
		}

	}
	

}
