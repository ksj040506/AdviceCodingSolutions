import java.util.*;

public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        // 여벌 체육복이 있지만 도난당한 학생을 제외한 목록 생성
        List<Integer> actualLost = new ArrayList<>();
        List<Integer> actualReserve = new ArrayList<>();

        // 정렬을 통해 체계적으로 탐색
        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 도난당한 학생과 여벌 체육복을 가진 학생이 중복되는 경우 제거
        for (int l : lost) {
            if (Arrays.stream(reserve).noneMatch(r -> r == l)) {
                actualLost.add(l); // 중복되지 않는 학생만 추가
            }
        }
        for (int r : reserve) {
            if (Arrays.stream(lost).noneMatch(l -> l == r)) {
                actualReserve.add(r); // 중복되지 않는 학생만 추가
            }
        }

        // 체육복 빌려주기 로직
        int studentsWithUniform = n - actualLost.size(); // 처음에 체육복을 가진 학생 수

        for (int l : actualLost) {
            // 바로 앞번호나 뒷번호 학생이 여벌 체육복을 가진 경우
            if (actualReserve.contains(l - 1)) {
                actualReserve.remove(Integer.valueOf(l - 1)); // 빌려주기 처리
                studentsWithUniform++;
            } else if (actualReserve.contains(l + 1)) {
                actualReserve.remove(Integer.valueOf(l + 1)); // 빌려주기 처리
                studentsWithUniform++;
            }
        }

        return studentsWithUniform;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(5, new int[]{2, 4}, new int[]{1, 3, 5})); // 출력: 5
        System.out.println(sol.solution(5, new int[]{2, 4}, new int[]{3}));       // 출력: 4
        System.out.println(sol.solution(3, new int[]{3}, new int[]{1}));          // 출력: 2
    }
}
