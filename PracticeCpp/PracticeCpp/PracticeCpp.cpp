// PracticeCpp.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include "Solution.h"

int main()
{
    Solution s;

	std::vector<int> test1 = { 1,1,1,2,2,3 };
	int result1 = s.removeDuplicates(test1);
    std::cout << "Result 1: " << result1 << " -> ";
    for (int i = 0; i < result1; ++i) std::cout << test1[i] << ' ';
    std::cout << '\n';

    std::vector<int> test2 = { 0,0,1,1,1,1,2,3,3 };
    int result2 = s.removeDuplicates(test2);
    std::cout << "Result 2: " << result2 << " -> ";
    for (int i = 0; i < result2; ++i) std::cout << test2[i] << ' ';
    std::cout << '\n';
}

// Run program: Ctrl + F5 or Debug > Start Without Debugging menu
// Debug program: F5 or Debug > Start Debugging menu

// Tips for Getting Started: 
//   1. Use the Solution Explorer window to add/manage files
//   2. Use the Team Explorer window to connect to source control
//   3. Use the Output window to see build output and other messages
//   4. Use the Error List window to view errors
//   5. Go to Project > Add New Item to create new code files, or Project > Add Existing Item to add existing code files to the project
//   6. In the future, to open this project again, go to File > Open > Project and select the .sln file
