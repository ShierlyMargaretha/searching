/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modus;

/**
 *
 * @author Asus
 */
public class Modus {
static int modus(int a[],int n) {
int maxValue = 0, maxCount = 0, i, j;
for (i = 0; i < n; ++i) {
int count = 0;
for (j = 0; j < n; ++j) {
if (a[j] == a[i])
++count;
}

if (count > maxCount) {
maxCount = count;
maxValue = a[i];
}
}
return maxValue;
}
public static void main(String args[]){
int n = 10;
int a[] = {1,6,7,2,7,4,6,7,9,10};
System.out.println("Modusnya adalah :"+modus(a,n));
}
}