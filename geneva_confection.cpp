#include <iostream>
# include <string>
#include <stack>
using namespace std;
int main()
{
	int t;
	cin >> t;
	for (int i = 0; i < t; i++)
	{
		int n, trains, tl=1;
		stack<int>mt;
		stack<int>rl;
		cin >> n;
		for (int i = 0; i < n; i++)
		{
			cin >> trains;
			mt.push(trains);
		}

		while (!mt.empty())
		{
			if (mt.top() != tl)
			{
				if (rl.empty()||rl.top()!=tl)
				{
					rl.push(mt.top());
					mt.pop();
				}
				else if (rl.top() == tl)
				{
					rl.pop();
					tl++;
				}

			}
			else
			{
				mt.pop();
				tl++;
			}
		}

		while (!rl.empty()&&rl.top()==tl)
		{
				rl.pop();
				tl++;
		}

		if (rl.empty())
			cout << "Y\n";
		else
		{
			cout << "N\n";
			while (!rl.empty())
				rl.pop();
		}
		while (!mt.empty())
			mt.pop();

	}
	return 0;
}
