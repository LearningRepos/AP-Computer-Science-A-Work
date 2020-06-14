/*
 * Purpose: To perform many 2-d array commands
 *
 * < Mihir Achyuta >
 * < 3/22/20 >
 // PMR : This project was fairly easy since for the picture class you only had to change a few lines of code adn for the 2-d array you just had to implement previous techniques into a 2d format
*/

public class IntArrayWorker
{
  /** two dimensional matrix */
  private int[][] matrix = null;
  
  /** set the matrix to the passed one
    * @param theMatrix the one to use
    */
  public void setMatrix(int[][] theMatrix)
  {
    matrix = theMatrix;
  }
  
  /**
   * Method to return the total 
   * @return the total of the values in the array
   */
  public int getTotal()
  {
    int total = 0;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; col++)
      {
        total = total + matrix[row][col];
      }
    }
    return total;
  }
  
  /**
   * Method to return the total using a nested for-each loop
   * @return the total of the values in the array
   */
  public int getTotalNested()
  {
    int total = 0;
    for (int[] rowArray : matrix)
    {
      for (int item : rowArray)
      {
        total = total + item;
      }
    }
    return total;
  }
  
  /**
   * Method to fill with an increasing count
   */
  public void fillCount()
  {
    int numCols = matrix[0].length;
    int count = 1;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < numCols; col++)
      {
        matrix[row][col] = count;
        count++;
      }
    }
  }
  
  /**
   * print the values in the array in rows and columns
   */
  public void print()
  {
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; col++)
      {
        System.out.print( matrix[row][col] + " " );
      }
      System.out.println();
    }
    System.out.println();
  }
  
  
  /** 
   * fill the array with a pattern
   */
  public void fillPattern1()
  {
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; 
           col++)
      {
        if (row < col)
          matrix[row][col] = 1;
        else if (row == col)
          matrix[row][col] = 2;
        else
          matrix[row][col] = 3;
      }
    }
  }

  public int getCount(int number) {
    int count = 0; // defining counter as 0
    for (int row = 0; row < matrix.length; row = row + 1) {

      for (int column = 0; column < matrix[0].length; column = column + 1) {
//traverses columns in 1 row then moves on to a row
        if (matrix[row][column] == number) {
          count++; //count added 1 when the exact row and column matches the number
        }
      }
    }
    return count; // count returned at the end for output
  }


  public int getLargest() {
    int max = Integer.MIN_VALUE; // if you want a max then use the MIN_VALUE and if u want a min then use MAX_VALUE

    for (int row = 0; row < matrix.length; row = row + 1) {
      //all the columns looped first in a row then move on to another row and loop columns there

      for (int column = 0; column < matrix[0].length; column = column + 1) {

        if (matrix[row][column] > max) {
          max = matrix[row][column]; // new max created to do the getLargest method

        }
      }
    }
    return max; //max returned for output
  }

  public int getColTotal(int column) {
    int count = 0; //need count to count all the integers in a certain column

    for (int row = 0; row < matrix.length; row++) {
      //only 1 for loop since only using 1 column for looping and multiple rows in that column
      count += matrix[row][column];
    }
    return count;// count returned for output
  }

}