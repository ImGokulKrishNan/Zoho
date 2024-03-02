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
6.
   `int m = 0, n = 0; `
      `  int p = --m * --n * n-- * m--;`
      `  System.out.println(p); `
        1
  7.
       `int i=19, j=29, k;`
        k = i-- - i++ + --j - ++j + --i - j-- + ++i - j++;
         
        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("k="+k);  
    i = 19
    j = 29
    k = 20

8.
  	`int a=1;`
         
        a = a++ + ++a * --a - a--;
         
        System.out.println(a);
a = 5

9.
 `int a = 11++;`
         
        System.out.println(a);
   Compile time error : ++ or — can’t be applied to constants.

10.
`int i = 11;`
         
        int j = --(i++);
   Because, ++ or — can’t be nested [ –(i++) ].

   11.
       ` int x = 001, y=010, z=100;`
         
        `int i = --x + y++ - z-- - --z + ++y - --x + y-- - --x;`
         
        `System.out.println("x="+x);`
        `System.out.println("y="+y);`
        `System.out.println("z="+z);`
        `System.out.println("i="+i);`

      x = -2
      y = 9
      z = 98
      i = -167
