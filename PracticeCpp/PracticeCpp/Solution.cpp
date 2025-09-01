#include "Solution.h"

int Solution::removeDuplicates(std::vector<int>& nums) {
	if (nums.size() <= 2) return nums.size();

	int writeIndex = 2;
	for(int read = 2; read < nums.size(); read++) {
		if (nums[read] != nums[writeIndex - 2]) {
			nums[writeIndex] = nums[read];
			++writeIndex;
		}
	}
	return writeIndex;
}