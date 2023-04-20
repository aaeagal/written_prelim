Write a java function that given an integer array height of length n There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]). Find two lines that together with the x-axis form a container, such that the container contains the most water. Return the maximum amount of water a container can store. Notice that you may not slant the container.


public int maxArea(int[] height) {
    int maxarea = 0, l = 0, r = height.length - 1;
    while (l < r) {
        maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
        if (height[l] < height[r])
            l++;
        else
            r--;
    }
    return maxarea;
}


public static int maxWater(int[] heights) {
    int max = 0;
    int left = 0;
    int right = heights.length - 1;
    while (left < right) {
        int area = Math.min(heights[left], heights[right]) * (right - left);
        max = Math.max(max, area);
        if (heights[left] < heights[right]) {
            left++;
        } else {
            right--;
        }
    }
    return max;
}


public static int maxWater(int[] height) {
    int maxWater = 0;
    int left = 0;
    int right = height.length - 1;
    while (left < right) {
        int minHeight = Math.min(height[left], height[right]);
        maxWater = Math.max(maxWater, minHeight * (right - left));
        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }
    return maxWater;
}


public static int maxArea(int[] height) {
    int maxArea = 0;
    int left = 0;
    int right = height.length - 1;
    
    while (left < right) {
        int area = Math.min(height[left], height[right]) * (right - left);
        maxArea = Math.max(maxArea, area);
        
        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }
    
    return maxArea;
}


public static int maxArea(int[] height) {
    int maxArea = 0;
    int left = 0;
    int right = height.length - 1;
    
    while(left < right) {
        int area = Math.min(height[left], height[right]) * (right - left);
        maxArea = Math.max(maxArea, area);
        if(height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }
    return maxArea;
}


public static int maxArea(int[] height) { 
    int maxArea = 0; 
    int left = 0; 
    int right = height.length - 1; 
  
    while (left < right) { 
        maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left)); 
        if (height[left] < height[right]) 
            left++; 
        else
            right--; 
    } 
  
    return maxArea; 
}


public static int maxArea(int[] height) {
    int maxArea = 0;
    int left = 0;
    int right = height.length - 1;
    
    while (left < right) {
        int currentArea = Math.min(height[left], height[right]) * (right - left);
        maxArea = Math.max(maxArea, currentArea);
        
        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }
    
    return maxArea;
}


public static int maxArea(int[] height) {
    int maxArea = 0;
    int left = 0;
    int right = height.length - 1;
    while (left < right) {
        maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }
    return maxArea;
}


public static int maxArea(int[] height) { 
  int maxArea = 0; 
  int left = 0; 
  int right = height.length - 1; 
  while (left < right) { 
    int currentArea = (right - left) * Math.min(height[left], height[right]); 
    maxArea = Math.max(maxArea, currentArea); 
    if (height[left] < height[right]) { 
      left++; 
    } else { 
      right--; 
    } 
  } 
  return maxArea; 
}


public static int maxArea(int[] height) {
  int maxArea = 0;
  int left = 0;
  int right = height.length - 1;
  while (left < right) {
      maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
      if (height[left] < height[right]) {
          left++;
      } else {
          right--;
      }
  }
  return maxArea;
}


public static int maxWaterContainer(int[] height) {
    // Initialize variables
    int maxArea = 0;
    int l = 0;
    int r = height.length - 1;
    
    // Loop until left and right pointers meet
    while (l < r) {
        // Calculate area
        int area = (r - l) * Math.min(height[l], height[r]);
        // Update max area if area is greater than max
        maxArea = Math.max(maxArea, area);
        // Move pointer with smaller height towards center
        if (height[l] < height[r]) {
            l++;
        } else {
            r--;
        }
    }
    return maxArea;
}


public static int maxArea(int[] height) {
    int maxArea = 0;
    int left = 0;
    int right = height.length-1;
    while (left < right) {
        int currentArea = Math.min(height[left], height[right]) * (right - left);
        maxArea = Math.max(maxArea, currentArea);
        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }
    return maxArea;
}


public int maxArea(int[] height) {
    int maxArea = 0;
    int left = 0;
    int right = height.length - 1;
    
    while (left < right) {
        int area = Math.min(height[left], height[right]) * (right - left);
        maxArea = Math.max(maxArea, area);
        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }
    return maxArea;
}


public static int maxWater(int[] height) {
    int maxArea = 0;
    int left = 0;
    int right = height.length - 1;
    while (left < right) {
        int area = (right - left) * Math.min(height[left], height[right]);
        maxArea = Math.max(maxArea, area);
        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }
    return maxArea;
}


public int maxArea(int[] height) {
    int maxArea = 0;
    int left = 0;
    int right = height.length - 1;
    while (left < right) {
        int area = Math.min(height[left], height[right]) * (right - left);
        maxArea = Math.max(maxArea, area);
        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }
    return maxArea;
}


public static int maxWater(int[] height) {
  int left = 0; 
  int right = height.length - 1; 
  int maxArea = 0; 
  
  while (left < right) {
    int area = Math.min(height[left], height[right]) * (right - left); 
    maxArea = Math.max(area, maxArea); 
    
    if (height[left] < height[right]) 
      left++; 
    else 
      right--; 
  }
  
  return maxArea; 
}


public int maxWater(int[] height) {
    int maxWater = 0;
    int left = 0;
    int right = height.length - 1;
    
    while (left < right) {
        maxWater = Math.max(maxWater, (right - left) * Math.min(height[left], height[right]));
        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }
    
    return maxWater;
}


public int maxArea(int[] height) {
    int left = 0;
    int right = height.length - 1;
    int maxArea = 0;
 
    while (left < right) {
        int area = Math.min(height[left], height[right]) * (right - left);
        maxArea = Math.max(maxArea, area);
 
        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }
 
    return maxArea;
}


public static int maxWaterContainer(int[] height) {
	int maxArea = 0;
	int left = 0;
	int right = height.length - 1;
	while (left < right) {
		int area = Math.min(height[left], height[right]) * (right - left);
		maxArea = Math.max(maxArea, area);
		if (height[left] < height[right]) {
			left++;
		} else {
			right--;
		}
	}
	return maxArea;
}


public static int maxWater(int[] height) {
    int n = height.length;
    int left = 0;
    int right = n - 1;
    int maxWater = 0;
    while (left < right) {
        maxWater = Math.max(maxWater, Math.min(height[left], height[right]) * (right - left));
        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }
    return maxWater;
}
