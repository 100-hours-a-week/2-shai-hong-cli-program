package src;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Player> players = new ArrayList<>();
        players.add(new StarPlayer("Stephen Curry", 93, 50, "MVP 2회"));
        players.add(new Player("LeBron James", 90, 40));
        players.add(new StarPlayer("Kevin Durant", 92, 45, "Finals MVP 2회"));
        players.add(new Player("Luka Doncic", 90, 40));
        players.add(new Player("Anthony Davis", 85, 35));
        players.add(new StarPlayer("Shai Gilgeous-Alexander", 95, 40, "올-NBA 1st 팀"));
        players.add(new Player("Bam Adebayo", 80, 30));
        players.add(new Player("Jason Tatum", 85, 40));
        players.add(new Player("Paul George", 80, 35));
        players.add(new Player("Kawhi Leonard", 85, 40));

        Team team = new Team();

        System.out.println("🏀 NBA 선수 드래프트 시작! (최대 연봉 200)");
        System.out.println("\n📋 선수 목록:");
        for (int i = 0; i < players.size(); i++) {
            System.out.println((i + 1) + ". " + players.get(i));
        }

        System.out.println("\n선수를 뽑으세요! (1~10)");

        // 팀 선택 로직
        while (team.getRemainingSalary() > 0 && team.getSelectedPlayers().size() < 5) {
            System.out.print("\n선수 번호 입력: ");
            int choice = scanner.nextInt();

            if (choice < 1 || choice > 10) {
                System.out.println("❌ 올바른 번호를 입력하세요! (1~10)");
                continue;
            }

            Player selected = players.get(choice - 1);
            if (selected == null) {
                System.out.println("⚠️ 이미 선택한 선수입니다!");
                continue;
            }

            if (selected instanceof StarPlayer) {
                ((StarPlayer) selected).showAward();
                System.out.print("이 선수를 선택하시겠습니까? (yes/no): ");
                String confirm = scanner.next();
                if (!confirm.equalsIgnoreCase("yes")) {
                    continue;
                }
            }

            if (team.addPlayer(selected)) {
                players.set(choice - 1, null);
                System.out.println("✅ " + selected.name + "을(를) 팀에 추가했습니다!");
                System.out.println("💰 현재 총 연봉: " + (200 - team.getRemainingSalary()));
            }
        }

        System.out.println("\n⛔ 더 이상 선수를 추가할 수 없습니다.");
        team.showTeam();
        scanner.close();
    }
}
