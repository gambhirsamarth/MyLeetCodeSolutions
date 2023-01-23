/*
As we know the array should be start from increasing order and at some point follow decreasing order to make a peak for mountain.

We will run a while loop until arr[i] > arr[i+1] and store the count in a variable after the loop exit we need to check two condition wheathercount == array length or count == 0if any of them is true we will return false as there will be no peak formed.

Again we will run the while loop untilarr[i] > arr[i+1]and continue to increment of the count variable that we intialized earlier after the loop exit we will check weather count == array length return true because there is no other peak formed in the array. But if count != array length than there can be any other formation of peak so return false.
*/

class Solution
{
public:
     bool validMountainArray(vector<int> &arr)
     {

          int length = arr.size();
          int i = 0;
          while (i < length - 1 && arr[i] < arr[i + 1])
          {
               i++;
          }
          if (i == length - 1 || i == 0)
          {
               return false;
          }
          while (i < length - 1 && arr[i] > arr[i + 1])
          {
               i++;
          }
          if (i == length - 1)
          {
               return true;
          }
          else
          {
               return false;
          }
     }
};
