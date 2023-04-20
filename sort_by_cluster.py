# Finds code clones from prompt.Java in only_javaX.XX.txt

import os
import sys
#import collect_nl_samples
import nltk

def create_cluster_info():
    # read prompt.Java
    prompt_id = "reverse_integer"
    with open(f"samples/{prompt_id}/{prompt_id}.Java", "r") as f:
        code_samples = []
        lines = f.readlines()
        stop_token = "x"
        for line in lines:
           # store functions in code_samples
              if line.startswith("public"):
                    code_samples.append(line)
                    stop_token = "}"
                elif line.startswith("}"):
                    code_samples.append(line)
                    stop_token = "x"
                elif stop_token == "}":
                    code_samples.append(line)
        print(code_samples)







        


    


 
    
     


def main():
    create_cluster_info()

    print("End of program")
    

if __name__ == "__main__":
    main()