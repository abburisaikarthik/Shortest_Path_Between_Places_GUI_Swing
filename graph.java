import java.util.HashMap;

public class graph {
	String distance;
	static String str;
	 int path_array[];
	 HashMap<String,Integer>map;
	 HashMap<Integer,Integer>map1;
	 HashMap<Integer,String>map_dup;
	graph   (String from,String to){
		map=new HashMap<String,Integer>();
		map_dup=new HashMap<Integer,String>();
		add("MUMBAI");//0
		add("BENGALURU");//1
		add("HYDERABAD");//2
		add("KOLKATA");//3
		add("LUCKNOW");//4
		add("NEWDELHI");//5
		int graph[][] = new int[][] { 
			{ 0, 3, 2, 0, 0, 5}, 
			{ 3, 0, 1, 6, 0, 0}, 
			{ 2, 1, 0, 4, 4, 0}, 
			{ 0, 6, 4, 0, 3, 0}, 
			{ 0, 0, 4, 3, 0, 2}, 
			{ 5, 0, 0, 0, 2, 0} };
		    
		    int n=map.size();
		    
		    map1=new HashMap<Integer,Integer>();
		    if(map.containsKey(from)&map.containsKey(to)) {
		    	int src=map.get(from);
			    
			    int dest=map.get(to);
			    
			    for(int i=0;i<n;i++) {
					 map1.put(i,null);
				  }
		  distance= dijkstra(graph,src,dest,n)+""; 
		 
		   str=map_dup.get(dest)+"";
		  int x=map1.get(dest);
		    
		    while(x!=src) {
		    	str=str+">>"+map_dup.get(x);
		    	x=map1.get(x);
		    }
		    str=str+">>"+map_dup.get(src)+"";}
		    
//		   System.out.println(str);
		    else {
		    	distance="false";
		    }
	}
	void add(String s) {
    	map.put(s, map.size());
    	map_dup.put(map_dup.size(), s);
    }

	 int dijkstra(int graph[][],int source,int dest,int n){
		 path_array = new int[n];
		 Boolean sptSet[] = new Boolean[n]; 
		 for (int i = 0; i < n; i++) { 
	            path_array[i] = Integer.MAX_VALUE; 
	            sptSet[i] = false; 
	        }
		 path_array[source] = 0;
		 for(int i=0;i<n-1;i++) {
			 int min_index=-1;
			 int min=Integer.MAX_VALUE;
			 for (int j = 0; j < n; j++) {
		            if (sptSet[j] == false && path_array[j] <= min) { 
		                min = path_array[j]; 
		                min_index = j; 
		            } }
			 sptSet[min_index] = true;
			 for (int v = 0; v < n; v++) 
	                if (!sptSet[v] && graph[min_index][v] != 0 && path_array[min_index] != 
	                            Integer.MAX_VALUE && path_array[min_index] 
	                            + graph[min_index][v] < path_array[v]) {
	                            path_array[v] = path_array[min_index] + graph[min_index][v];
			 map1.put(v, min_index);} 
		 }
return path_array[dest];		 	 
	}
}
	

 
   