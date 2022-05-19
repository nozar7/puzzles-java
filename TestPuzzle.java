public class TestPuzzle
{
    public static void main(String[] args)
    {
        System.out.println("Test Puzzle Working!!");

    // CREAMOS INSTANCIA DE LA CLASE PUZZLEE JAVA 
    PuzzleJava puzzle = new PuzzleJava();

    System.out.println(puzzle.getTenRolls());
    System.out.println(puzzle.getRandomLetter());

    System.out.println("======= GENERATE PASSWORD ========");
    System.out.println(puzzle.generatePassword());
    System.out.println("======= GENERATE MATRIZ PASSWORD ======");
    puzzle.getNewPasswordSet(3);
    }
}
