import java.util.*;
import java.util.Map.Entry;

public class AlexaOptimizing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number Locations: ");
		int noLocation = sc.nextInt();
		int i=0;
		List<List<Integer>> xy_corr= new ArrayList<List<Integer>>();
		while(i<noLocation)
		{
			List<Integer> cor=new ArrayList<Integer>();
			System.out.println("Enter coordinates for "+(i+1)+"location ");	
			System.out.print(" X: ");
			cor.add(sc.nextInt());
			System.out.print(" Y: ");
			cor.add(sc.nextInt());
			xy_corr.add(cor);
			i++;
		}
		System.out.println("Enter the Number Restuarant for suggestion: ");
		int noRestuarant = sc.nextInt();
		List<List<Integer>> Result=restaurantSuggestion(xy_corr, noRestuarant);
		System.out.println("Your Output: "+Result);

	}
	
	public static List<List<Integer>> restaurantSuggestion(List<List<Integer>> allLocation, int numberOfRestaurant )
	{
		if(numberOfRestaurant<=allLocation.size())
		{
			HashMap<List<Integer>,Double> Res=new HashMap<List<Integer>,Double>();
			for(List<Integer> number: allLocation)
			{
				double x=number.get(0);
				double y=number.get(1);
				double xy=Math.pow(x, 2) + Math.pow(y, 2);
				double sqr=Math.sqrt(xy);
				System.out.println("sqr: "+sqr);
				Res.put(number, sqr);
				
			}
			Map<List<Integer>,Double> sortedRes = mapSort(Res);
			List<List<Integer>> Result = new ArrayList<List<Integer>>();
			int i=0;
			for(Entry<List<Integer>, Double> ent:sortedRes.entrySet())
			{
				Result.add(ent.getKey());
				i++;
				if(i==numberOfRestaurant)
					break;
			}
			return Result;

		}
		else return null;
	}
	
    public static <K, V extends Comparable<V> > Map<K, V> 
    mapSort(final Map<K, V> map) 
    {  
        Comparator<K> valueComparator = new Comparator<K>() { 

        	public int compare(K k1, K k2) 
                  { 
                      int comp = map.get(k1).compareTo( 
                          map.get(k2)); 
                      if (comp == 0) 
                          return 1; 
                      else
                          return comp; 
                  } 
            
              }; 
        
        Map<K, V> sorted = new TreeMap<K, V>(valueComparator); 
        sorted.putAll(map); 
        return sorted; 
    } 

}
