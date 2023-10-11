package stack;

import java.util.Stack;

/**
 * {@code @author} JSY
 * {@code @date} 2023/1/29
 * {@code @className} DecodeString
 * {@code @description} leetCode 394 字符串解码
 * <p>
 * 给定一个经过编码的字符串，返回它解码后的字符串。
 * <p>
 * 编码规则为: k[encoded_string]，表示其中方括号内部的 encoded_string 正好重复 k 次。注意 k 保证为正整数。
 * <p>
 * 你可以认为输入字符串总是有效的；输入字符串中没有额外的空格，且输入的方括号总是符合格式要求的。
 * <p>
 * 此外，你可以认为原始数据不包含数字，所有的数字只表示重复的次数 k ，例如不会出现像3a或2[4]的输入。
 * <p> 示例 1：
 * <p>
 * 输入：s = "3[a]2[bc]"
 * 输出："aaabcbc"
 * 示例 2：
 * <p>
 * 输入：s = "3[a2[c]]"
 * 输出："accaccacc"
 * 示例 3：
 * <p>
 * 输入：s = "2[abc]3[cd]ef"
 * 输出："abcabccdcdcdef"
 * 示例 4：
 * <p>
 * 输入：s = "abc3[cd]xyz"
 * 输出："abccdcdcdxyz"
 * <p> 提示：
 * <p>
 * 1 <= s.length <= 30
 * s由小写英文字母、数字和方括号'[]' 组成
 * s保证是一个有效的输入。
 * s中所有整数的取值范围为[1, 300]
 */
public class DecodeString {
    public String decodeString(String s) {
        String res = "";
        Stack<Integer> countStack = new Stack<>();
        Stack<String> resStack = new Stack<>();
        int idx = 0;
        while (idx < s.length()) {
            char cur = s.charAt(idx);
            // 处理数字
            if (Character.isDigit(cur)) {
                StringBuffer ret = new StringBuffer();
                while (Character.isDigit(s.charAt(idx))) {
                    ret.append(s.charAt(idx++));
                }
                countStack.push(Integer.parseInt(ret.toString()));
            } else if (cur == '[') {
                // 处理 ‘[’
                resStack.push(res);
                res = "";
                idx++;
            } else if (cur == ']') {
                // 处理']'，处理匹配的'['之间的字符
                StringBuffer temp = new StringBuffer(resStack.pop());
                int repeatTimes = countStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    temp.append(res);
                }
                res = temp.toString();
                idx++;
            } else {
                // 处理普通字符
                res += s.charAt(idx++);
            }
        }
        return res;
    }
}
