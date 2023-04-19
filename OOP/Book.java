package OOP;

public class Book {
        public String title;
        public String author;
        private int numberOfPages;

        public void setNumberOfPages(int numberOfPages){
            if(isnumberOfPagesCorrect(numberOfPages)){
            this.numberOfPages = numberOfPages;
        }else{
                System.out.println("The provided number of pages in incorrect" + numberOfPages);
            }
        }
        private boolean isnumberOfPagesCorrect(int numberOfPages){
            return numberOfPages >=10;
        }
        public void printBookInfo(){
            if(isnumberOfPagesCorrect(numberOfPages)){
                System.out.printf("The book %s with author %s has %d pages\n", title, author, numberOfPages);
            }else {
                System.out.println("Cannot print book info because number of pages are invalid");
            }
        }
    }

