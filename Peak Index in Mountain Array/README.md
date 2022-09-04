<h2><a href="https://leetcode.com/problems/peak-index-in-a-mountain-array/" targer="_blank">Peak Index in a Mountain Array</a></h2>
 
  <p>An array arr a mountain if the following properties hold:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].

You must solve it in O(log(arr.length)) time complexity.
</p>

 

<strong>Example 1:</strong>
<pre>
<strong>Input:</strong> arr = [0,1,0]
<strong>Output:</strong> 1
</pre>

<strong>Example 2:</strong>
<pre>
<strong>Input:</strong> arr = [0,2,1,0]
<strong>Output:</strong> 1
</pre>

<strong>Example 3:</strong>
<pre>
<strong>Input:</strong> arr = [0,10,5,2]
<strong>Output:</strong> 1
</pre>
 

<strong>Constraints:</strong>
<pre>
3 <= arr.length <= 105
0 <= arr[i] <= 106
arr is guaranteed to be a mountain array.
</pre>
