package com.homeworks.aca_book.nested.newNested;

/**
 * Created by home on 11/13/2018.
 */
public class Task19 {
    class Task19Inner {
        public Task19Inner() {
            System.out.println("Task19Inner");

        }
        class Tas19InnerInner{
            public Tas19InnerInner() {
                System.out.println("Task19Inner");
            }
        }
    }

    static class Task19Nested{
        public Task19Nested() {
            System.out.println("Task19Nested");
        }
       static class Task19NestedNested{
          public Task19NestedNested() {
              System.out.println("Task19NestedNested");
           }
       }
    }
}

