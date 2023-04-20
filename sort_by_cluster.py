# Finds code clones from prompt.Java in only_javaX.XX.txt

import os
import sys
#import collect_nl_samples
import nltk
nltk.download("punkt")

prompt_id = "reverse_integer"
simularity_score = 0.01

def get_original_functions():
    # read prompt.Java
    with open(f"samples/{prompt_id}/{prompt_id}.Java", "r") as f:
      
        original_functions = [[]]
        counter = 0
        lines = f.readlines()
        for line in lines:
            # make a new list for every function
            if line.startswith("public"):
                # add all lines to one element in the list until the next public word
                original_functions.append([])
                counter += 1
            
            #remove comments
            if "//" in line:
                line = ""

            

            original_functions[counter].append(line)
        
    return original_functions
    


def look_for_clones(original_functions):

    with open(f"samples/{prompt_id}/only_java{simularity_score}.txt", "r") as f:
        lines = f.readlines()
        




def main():
    original_functions = get_original_functions()
    look_for_clones(original_functions)

    print("End of program")
    

if __name__ == "__main__":
    main()