package exam_network;

public class QuizProtocol {
    private static final int WAITING = 0;
    private static final int PROBLEM = 1;
    private static final int ANSWER = 2;

    private static final int NUMPROBLEMS = 3;

    private int state = WAITING;
    private int currentProblem = 0;

    private String[] problems = { 
    		"아몬드가 죽으면?",
    		"왕이 넘어지면?",
    		"김서건은?"}; // 3개의 퀴즈문제를 작성해 주세요.
    private String[] answers = { 
    		"다이아몬드",
    		"킹콩",
    		"짱짱맨"};  // 3개의 퀴즈에 대한 정답을 작성해 주세요.

    public String process(String theInput) {
        String theOutput = null;

        if (state == WAITING) {
            theOutput = "퀴즈를 시작합니다(y/n)";
            state = PROBLEM;
        } 
        else if (state == PROBLEM) {
            if (theInput.equalsIgnoreCase("y")) { //ignore 대소문자 관계없이
                theOutput = problems[currentProblem];
                state = ANSWER;
            } 
            else {
                state = WAITING;
                theOutput = "quit";
            }
        } 
        else if (state == ANSWER) {
            if (theInput.equalsIgnoreCase(answers[currentProblem])) {
                theOutput = "정답입니다. 계속하시겠습니까? (y/n)";
                state = PROBLEM;
            } 
            else {
                state = PROBLEM;
                theOutput = "오답입니다. 계속하시겠습니까? (y/n)";
            }
            currentProblem = (currentProblem + 1) % NUMPROBLEMS; //나머지를 통한 반복
        }
        return theOutput;
    }
}