import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerDNA {

	public static void main(String[] args) throws IOException {
		final BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		final StringBuilder builder = new StringBuilder();
		final int number_trials = Integer.valueOf(input.readLine());

		for (int trial = 0; trial < number_trials; trial++) {
			final int allowed_mismatches = 1;
			final char[] text = input.readLine().toCharArray();
			final char[] pattern = input.readLine().toCharArray();
			input.readLine();

			for (int text_index = 0; text_index < text.length - pattern.length
					+ 1; text_index++) {
				int pattern_index = 0;
				int missed = 0;

				while (pattern_index < pattern.length
						&& missed <= allowed_mismatches) {
					if (text[text_index + pattern_index] != pattern[pattern_index]) {
						missed++;
					}

					pattern_index++;
				}

				if (missed <= allowed_mismatches) {
					System.out.print(text_index + " ");
				}
			}
			System.out.println();
		}
	}
}