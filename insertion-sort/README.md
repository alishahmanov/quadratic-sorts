Insertion Sort Project

This module is part of the Quadratic Sorts assignment.
Here I implemented Insertion Sort with a small optimization for nearly-sorted arrays.

--What I did

Implemented InsertionSort algorithm in Java.

Added PerformanceTracker to measure comparisons, swaps, array accesses and execution time.

Wrote unit tests with JUnit (empty arrays, single element, duplicates, sorted and reverse-sorted arrays).

Created a CLI program where you can input array size and see how the algorithm works.

Added a Benchmark Runner that runs Insertion Sort on arrays of size 100–20000 and saves results to CSV.

--How it works

Run the CLI:

mvn -pl insertion-sort exec:java -Dexec.mainClass="cli.AlgorithmCLI"

-- Program will generate a random array, sort it, and print metrics.

Run the Benchmark Runner:

mvn -pl insertion-sort exec:java -Dexec.mainClass="cli.InsertionBenchmarkRunner"


-- Results will be saved to insertion_results.csv.

✅ Example of results
n,comparisons,swaps,arrayAccesses,time(ms)
100,2734,2635,5464,0.178
1000,256059,255060,512114,4.388
5000,6218843,6213844,12437677,11.570


As expected, the number of operations grows quadratically, which matches the theoretical O(n²) complexity of Insertion Sort.