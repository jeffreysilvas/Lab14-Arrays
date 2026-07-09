// YOUR NAME:
// COLLABORATORS:
// LAST MODIFIED DATE: 
/*
Yearly Global Atmospheric CO₂ Levels (parts per million)
2001: 371.32 ppm
2002: 373.45 ppm
2003: 375.98 ppm
2004: 377.70 ppm
2005: 379.98 ppm
2006: 382.09 ppm
2007: 384.03 ppm
2008: 385.83 ppm
2009: 387.64 ppm
2010: 390.10 ppm
2011: 391.85 ppm
2012: 394.06 ppm
2013: 396.74 ppm
2014: 398.87 ppm
2015: 401.01 ppm
2016: 404.41 ppm
2017: 406.76 ppm
2018: 408.72 ppm
2019: 411.66 ppm
2020: 414.24 ppm
(Data from: https://www.esrl.noaa.gov/gmd/webdata/ccgg/trends/co2/co2_annmean_mlo.txt)
*/

class Main 
{
	//CONSTANTS SECTION

  public static void main(String[] args) 
  {
    // DECLARATION SECTION
    double[] co2Levels;
    int[] years = new int[20];
    double co2LevelDifference;

    // INITIALIZATION SECTION
    co2Levels = new double[] {
            371.32, 373.45, 375.98, 377.7, 379.98, 382.09, 384.03, 385.03, 387.64, 390.1,
            391.85, 394.06, 396.74, 398.87, 401.01, 404.41, 406.76, 408.72, 411.66, 414.24
    };

    for(int i = 0; i < years.length; i++)
    {
      years[i] = 2001 + i;
    }

    co2LevelDifference = co2Levels[co2Levels.length - 1] - co2Levels[0];

    // OUTPUT SECTION
    printGraph(co2Levels, years);


    System.out.printf("From %d to %d, the average atmospheric CO₂ levels across the globe has grown %.2f ppm.",
            years[0], years[years.length - 1], co2LevelDifference);
  }

  //STATIC METHODS

  static void printBar(double data, int year) {
    int barCount = (int)data - 360;
    System.out.printf("%d: ", year);
    for (int i = 0; i < barCount; i++) {
      System.out.print("\uD83D\uDEE2");
    }
    System.out.printf(" %.2f%n", data);
  }

  static void printGraph(double[] data, int[] years) {
    for (int i = 0; i < years.length; i++) {
      printBar(data[i], years[i]);
    }
  }

}