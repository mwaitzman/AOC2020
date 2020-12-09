public class Day7 {
  public class Bag {
    public Bag[] possibleContents;
    public Bag(String name, Bag[] contents) {
      this.name = name;
      this.possibleContents = contents;
    }
    public Bag(String name) {
      this.name = name;
      this.possibleContents = null;
    }
  }
  Parser.separate(inputFile).by('\n').ordered().to(new String[] data);
  data.do {
    forEach(e ->
      at first instance of token(" bags ") {
        add e.dataBefore(triggerer) to next in String[] name;
      }
    after
    )
  }
  )
  static int numberOfBagsThatCanContainAtLeastOneShinyGoldBag(Bag[] bags) {
    int result = 0;
    for(Bag bag : bags) {
      for(int i = 0; i < bags.length; i++) {
        if (bag.possibleValues().contains("shiny gold")) return true
      }
    }
  }
}
