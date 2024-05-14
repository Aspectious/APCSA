package com.aspectious.Alculator.gui;

import javax.swing.text.*;

public class InputFilter extends DocumentFilter {
    @Override
    public void insertString(DocumentFilter.FilterBypass fb, int offset,
            String text, AttributeSet attr)
            throws BadLocationException {
        StringBuilder buffer = new StringBuilder(text.length());
        char[] validChars = new char[] {
        	'0','1','2','3','4','5','6','7','8','9','+','-','*','/'	
        };
        for (int i = text.length() - 1; i >= 0; i--) {
            char ch = text.charAt(i);
            for (int P=0; P<validChars.length; P++) {
            	if (ch == validChars[P]) buffer.append(ch);
            }
        }
        super.insertString(fb, offset, buffer.toString(), attr);
    }

    @Override
    public void replace(DocumentFilter.FilterBypass fb,
            int offset, int length, String string, AttributeSet attr) throws BadLocationException {
        if (length > 0) {
            fb.remove(offset, length);
        }
        insertString(fb, offset, string, attr);
    }
}