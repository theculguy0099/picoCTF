encoded_string = chr(0x64) + chr(0x65) + chr(0x37) + chr(0x36)

decoded_string = ''.join([chr(int(encoded_char, 16)) for encoded_char in [encoded_string[i:i+2] for i in range(0, len(encoded_string), 2)]])

print("Decoded String:", decoded_string)
