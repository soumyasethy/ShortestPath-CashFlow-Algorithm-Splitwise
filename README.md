# Welcome to the Shortest Path or CashFlow-Algorithm-Splitwise Readme!  

The idea is to use Shortest path algorithm where at every step, settle all amounts of one person and recur for remaining n-1 persons.  

  
# Getting Started  
  
For example, if the following weighted directed graph represents some people and the arrows represent debts between them (Alice owes Bob $20 and Charlie $5, Bob owes Charlie $10, etc.):

How to pick the first person? To pick the first person, calculate the net amount for every person where net amount is obtained by subtracting all debts (amounts to pay) from all credits (amounts to be paid). Once net amount for every person is evaluated, find two persons with maximum and minimum net amounts. These two persons are the most creditors and debtors. The person with minimum of two is our first person to be settled and removed from list. Let the minimum of two amounts be x. We pay ‘x’ amount from the maximum debtor to maximum creditor and settle one person. If x is equal to the maximum debit, then maximum debtor is settled, else maximum creditor is settled.

![Problem Statement](https://github.com/soumyasethy/ShortestPath-CashFlow-Algorithm-Splitwise/blob/Images/Screen%20Shot%202017-07-24%20at%208.29.26%20PM.png)

There's no sense in $10 making its way from Alice to Bob and then from Bob to Charlie if Alice could just give it to Charlie directly.

The goal, then, in the general case is to take a debt graph and simplify it (i.e. produce a new graph with the same nodes but different edges).

# How to Use?  
  
I have created a method which just do it.  
   **"findPath(parm)"**  
    
**Create a HashMap Variable**  
  "static HashMap parm = new HashMap()"  
  
**Add the Expense in below formate**  

       "parm.put("Name", Amoun)"  
  
  For Example,  
  
        parm.put("A", -5.0);  
        parm.put("B", 25.0);  
        parm.put("C", -20.0);  
        parm.put("D", 25.0);  
        parm.put("E", -20.0);  
        parm.put("F", -5.0);  

**Passing values to find the Net Amount to be Paid with Person Name -Cash Flow / Shortest Path**  
      
      findPath(parm);  
      
**Out Put**  
C needs to pay B:20.0  
E needs to pay D:20.0  
A needs to pay B:5.0  
F needs to pay D:5.0  
        
![Problem Statement](https://github.com/soumyasethy/ShortestPath-CashFlow-Algorithm-Splitwise/blob/Images/Screen%20Shot%202017-07-24%20at%209.50.56%20PM.png)
![Problem Statement](https://github.com/soumyasethy/ShortestPath-CashFlow-Algorithm-Splitwise/blob/Images/Screen%20Shot%202017-07-24%20at%209.51.01%20PM.png)
