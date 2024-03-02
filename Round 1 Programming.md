# Pre/ Post Increment And Decrement Operators

1.
	    `int i = 11; 
        `i = i++ + ++i;
         
        System.out.println(i);
           i = 24
2.
        `int i=1, j=2, k=3;
         
        int m = i-- - j-- - k--;
         
        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("k="+k);
        System.out.println("m="+m);
  i = 0
  j = 1
  k = 2
  m = -4
4.
    `int` `a=``11``, b=``22``, c;`

        `c = a + b + a++ + b++ + ++a + ++b;`

        `System.out.println(``"a="``+a);`

        `System.out.println(``"b="``+b);`

        `System.out.println(``"c="``+c);`

a = 13
b = 24
c = 103

5.
`int a=1, b=2;`
`System.out.println(--b - ++a + ++b - --a);`

0
         

