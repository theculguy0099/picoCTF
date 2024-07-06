hex_string = "eacef35ceac15db2ecaedd6b1b9280dd"

# Check if the length of the hex string is even
if len(hex_string) % 2 != 0:
    hex_string = '0' + hex_string  # Add a leading '0' if the length is odd

# Convert hex to bytes
byte_data = bytes.fromhex(hex_string)

# Convert bytes to ASCII string using 'latin-1'
ascii_string = byte_data.decode('latin-1')

print(ascii_string)
