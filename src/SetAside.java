ArrayList<String> wtf = new ArrayList<>();
        for(int k=0; k< data.length; k++) {
        String[] whatever = data[k].split(" ");
        ArrayList<String> empty = new ArrayList<>();
        ArrayList<String> ola = new ArrayList<>(Arrays.asList(whatever));

        for (int j = 0; j < ola.size(); j++) {
        if (Collections.frequency(ola, ola.get(j)) > 1 && !empty.contains(empty.get(j)) && ) {
        empty.add(ola.get(j));
        }
        }
        Collections.sort(empty);
        String answerstring = String.join(" ", ola);
        wtf.add(answerstring);

            