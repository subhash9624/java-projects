package xyz;
import java.util.*;
public class advancegraph {

		static class graph{
			private Map<Integer,List<Integer>> adjlist=new HashMap<Integer,List<Integer>>();
			void addedge(int u,int v) {
				adjlist.computeIfAbsent(u,k-> new ArrayList<>()).add(v);
				adjlist.computeIfAbsent(v,k-> new ArrayList<>()).add(u);
			}
			void printgraph() {
				for(int node:adjlist.keySet()) {
					System.out.println("Node "+ node +" is connected to : ");
					for(int neighbour : adjlist.get(node)) {
						System.out.println(neighbour + " ");
						
				}
	
					System.out.println(" ");
			}
		}
	}
		public static void main(String[] args) {
			
			graph g1=new graph();
			g1.addedge(1,2);
			g1.addedge(4,3);
			g1.addedge(1,4);
			g1.addedge(1,5);
			
			g1.printgraph();
		}
	}


