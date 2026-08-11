class Solution {

    class Visit {
        String user;
        String website;
        int time;

        Visit(String user, String website, int time) {
            this.user = user;
            this.website = website;
            this.time = time;
        }
    }

    public List<String> mostVisitedPattern(String[] username, int[] timestamp, String[] website) {

        // 1. Combine the three arrays
        List<Visit> visits = new ArrayList<>();

        for (int i = 0; i < username.length; i++) {
            visits.add(new Visit(username[i], website[i], timestamp[i]));
        }

        // 2. Sort all visits by timestamp
        visits.sort((a, b) -> Integer.compare(a.time, b.time));

        // 3. Group websites by user
        HashMap<String, List<String>> users = new HashMap<>();

        for (Visit v : visits) {
            users.computeIfAbsent(v.user, k -> new ArrayList<>()).add(v.website);
        }

        // 4. pattern -> number of users
        HashMap<String, Integer> patternCount = new HashMap<>();

        // 5. Generate patterns for every user
        for (String user : users.keySet()) {

            List<String> sites = users.get(user);

            // Important: one user should count only once for a pattern
            HashSet<String> seen = new HashSet<>();

            for (int i = 0; i < sites.size(); i++) {
                for (int j = i + 1; j < sites.size(); j++) {
                    for (int k = j + 1; k < sites.size(); k++) {

                        String pattern =
                                sites.get(i) + "," +
                                sites.get(j) + "," +
                                sites.get(k);

                        seen.add(pattern);
                    }
                }
            }

            // 6. Add each unique pattern of this user
            for (String pattern : seen) {
                patternCount.put(
                    pattern,
                    patternCount.getOrDefault(pattern, 0) + 1
                );
            }
        }

        // 7. Find the pattern with highest score
        String bestPattern = "";
        int bestScore = 0;

        for (String pattern : patternCount.keySet()) {

            int score = patternCount.get(pattern);

            if (score > bestScore ||
                (score == bestScore && pattern.compareTo(bestPattern) < 0)) {

                bestScore = score;
                bestPattern = pattern;
            }
        }

        // 8. Convert "home,about,career" back to List<String>
        return Arrays.asList(bestPattern.split(","));
    }
}