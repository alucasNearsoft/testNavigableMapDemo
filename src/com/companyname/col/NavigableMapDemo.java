package com.companyname.col;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;

/**
 * TreeMap is an example of a navigable map, which is a sorted map that can be iterated over in descending
order as well as ascending order, and which can report closest matches for given search targets.
Navigable maps are described by the NavigableMap interface, whose generic type is NavigableMap<K,V>,
which extends SortedMap.
 *
 */
class NavigableMapDemo
{
	public static void main(String[] args)
	{
		NavigableMap<String,Integer> nm = new TreeMap<>();
		String[] birds = { "sparrow", "bluejay", "robin" };
		int[] ints = { 83, 12, 19 };
		for (int i = 0; i < birds.length; i++)
			nm.put(birds[i], ints[i]);
		System.out.println("Map = "+nm);
		System.out.print("Ascending order of keys: ");
		NavigableSet<String> ns = nm.navigableKeySet();
		Iterator<String> iter = ns.iterator();
		while (iter.hasNext())
			System.out.print(iter.next()+" ");
		System.out.println();
		System.out.print("Descending order of keys: ");
		ns = nm.descendingKeySet();
		iter = ns.iterator();
		while (iter.hasNext())
			System.out.print(iter.next()+" ");
		System.out.println();
		System.out.println("First entry = "+nm.firstEntry());
		System.out.println("Last entry = "+nm.lastEntry());
		System.out.println("Entry < ostrich is "+nm.lowerEntry("ostrich"));
		System.out.println("Entry > crow is "+nm.higherEntry("crow"));
		System.out.println("Poll first entry: "+nm.pollFirstEntry());
		System.out.println("Map = "+nm);
		System.out.println("Poll last entry: "+nm.pollLastEntry());
		System.out.println("Map = "+nm);
	}
}