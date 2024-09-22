public class LargerThanFourNeighbors {

    public static Dog[] largerThanFourNeighbors(Dog[] dogs) {
        Dog[] returnDogs = new Dog[dogs.length];
        int cnt = 0;
        for(int i = 0; i < dogs.length; i += 1) {
            if(isBiggestOfFour(dogs, i)) {
                returnDogs[cnt] = dogs[i];
                cnt += 1;
            }
        }

        returnDogs = arrayWithNoNulls(returnDogs, cnt);
        return returnDogs;
    }

    //remove nulls from the returnDogs array
    public static Dog[] arrayWithNoNulls (Dog[] dogs, int cnt) {
        Dog[] newReturnDogs = new Dog[cnt];
        for (int m = 0; m < cnt; m++) {
            newReturnDogs[m] = dogs[m];
        }
        return  newReturnDogs;
    }

    public static boolean isBiggestOfFour(Dog[] dogs, int i) {
        boolean isBiggest = true;
        for (int j = -2; j <= 2; j += 1) {
            int compareIndex = i + j;

            if (j == 0) {
                continue;
            }

            if (validIndex(dogs, compareIndex)) {
                if(dogs[compareIndex].size >= dogs[i].size) {
                    isBiggest = false;
                }
            }
        }
        return isBiggest;
    }

    //check if the compareIndex is valid
    public static boolean validIndex(Dog[] dogs, int compareIndex) {
        return (compareIndex >= 0 && compareIndex < dogs.length);
    }

    public static class Dog {
        public int size;
        public Dog (int s) {
            size = s;
        }
    }

    public static void main(String[] args) {
        Dog[] dogs = new Dog[] {
                new Dog(10),
                new Dog(15),
                new Dog(20),
                new Dog(15),
                new Dog(10),
                new Dog(5),
                new Dog(10),
                new Dog(15),
                new Dog(22),
                new Dog(15),
                new Dog(20)
        };

        Dog[] bigDogs = largerThanFourNeighbors(dogs);
        for (int k = 0; k < bigDogs.length; k += 1) {
            if (bigDogs != null) {
                System.out.print(bigDogs[k].size + " ");
            }
        }
        System.out.println();
    }
}
