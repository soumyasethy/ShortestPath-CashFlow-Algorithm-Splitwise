For example, if the following weighted directed graph represents some people and the arrows represent debts between them (Alice owes Bob $20 and Charlie $5, Bob owes Charlie $10, etc.):
![Problem Statement](https://github.com/soumyasethy/ShortestPath-CashFlow-Algorithm-Splitwise/blob/Images/Screen%20Shot%202017-07-24%20at%208.29.26%20PM.png)

There's no sense in $10 making its way from Alice to Bob and then from Bob to Charlie if Alice could just give it to Charlie directly.

The goal, then, in the general case is to take a debt graph and simplify it (i.e. produce a new graph with the same nodes but different edges) such that

No node has edges pointing both in and out of it (no useless money changing hands)
All nodes have the same "flow" through them as they did in the original graph (it is identical in terms of where the money ends up).
By "flow", I mean the value of all inputs minus all outputs (is there a technical term for this? I am no graph theory expert). So in the example above, the flow values for each node are:

Bob: +10
Alice: -25
Charlie: +15
You can see that the first and second graphs have the same flow through each node, so this is a good solution. There are some other easy cases, for example, any cycle can be simplified by removing the lowest valued edge and subtracting its value from all other edges.

This:
