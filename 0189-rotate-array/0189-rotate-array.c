void rotate(int* nums, int numsSize, int k) {
int ret[numsSize];
  
  for (int i=0; i < numsSize; i++)
    ret[(i+k)%numsSize] = nums[i%numsSize];
  for (int i=0; i < numsSize; i++)
    nums[i] = ret[i];
}
    
