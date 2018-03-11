#include<iostream>

using namespace std;

int main()
{
	int r, h;
	cin >> r >> h;
	double v = (int)((3.1415926*r*r*h) / 3 *100);
	v /= 100;
	cout << v;


	return 0;
}
