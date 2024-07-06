def shift_by_13(text):
    result = ""
    for char in text:
        if char.isalpha():
            offset = 13 if char.islower() else -13
            result += chr(((ord(char) - ord('a' if char.islower() else 'A') +
                          offset) % 26) + ord('a' if char.islower() else 'A'))
        else:
            result += char
    return result


# Example usage:
input_text = "cvpbPGS{arkg_gvzr_V'yy_gel_2_ebhaqf_bs_ebg13_MAZyqFQj}"
output_text = shift_by_13(input_text)
print("Input Text: ", input_text)
print("Shifted Text: ", output_text)
