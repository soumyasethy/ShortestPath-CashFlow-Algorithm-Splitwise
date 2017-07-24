For example, if the following weighted directed graph represents some people and the arrows represent debts between them (Alice owes Bob $20 and Charlie $5, Bob owes Charlie $10, etc.):
![Problem Statement](https://github.com/soumyasethy/ShortestPath-CashFlow-Algorithm-Splitwise/blob/Images/Screen%20Shot%202017-07-24%20at%208.29.26%20PM.png)

There's no sense in $10 making its way from Alice to Bob and then from Bob to Charlie if Alice could just give it to Charlie directly.

The goal, then, in the general case is to take a debt graph and simplify it (i.e. produce a new graph with the same nodes but different edges).


