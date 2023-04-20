Write a java function that given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0. Notice that the solution set must not contain duplicate triplets.


public static List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums);

    for (int i = 0; i < nums.length - 2; i++) {
        if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
            int low = i + 1;
            int high = nums.length - 1;
            int sum = 0 - nums[i];
            while (low < high) {
                if (nums[low] + nums[high] == sum) {
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    while (low < high && nums[low] == nums[low + 1]) low++;
                    while (low < high && nums[high] == nums[high - 1]) high--;
                    low++;
                    high--;
                } else if (nums[low] + nums[high] > sum) {
                    high--;
                } else {
                    low++;
                }
            }
        }
    }
    return result;
}


public static List<List<Integer>> findTriplets(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums);
    for (int i = 0; i < nums.length; i++) {
        if (i > 0 && nums[i] == nums[i - 1]) {
            continue;
        }
        int left = i + 1;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[i] + nums[left] + nums[right];
            if (sum == 0) {
                result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                left++;
                right--;
                while (left < right && nums[left] == nums[left - 1]) {
                    left++;
                }
                while (left < right && nums[right] == nums[right + 1]) {
                    right--;
                }
            } else if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }
    }
    return result;
}


public static List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 2; i++) {
        if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
            int low = i + 1, high = nums.length - 1, sum = 0 - nums[i];
            while (low < high) {
                if (nums[low] + nums[high] == sum) {
                    res.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    while (low < high && nums[low] == nums[low + 1]) low++;
                    while (low < high && nums[high] == nums[high - 1]) high--;
                    low++;
                    high--;
                } else if (nums[low] + nums[high] < sum) {
                    low++;
                } else {
                    high--;
                }
            }
        }
    }
    return res;
}


public List<List<Integer>> threeSum(int[] nums) { 
  List<List<Integer>> result = new ArrayList<>(); 
  Arrays.sort(nums); 
  for (int i = 0; i < nums.length; i++) { 
    int j = i + 1; 
    int k = nums.length - 1; 
    while (j < k) { 
      int sum = nums[i] + nums[j] + nums[k]; 
      if (sum == 0) { 
        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]); 
        if (!result.contains(triplet)) { 
          result.add(triplet); 
        } 
        j++; 
        k--; 
      } else if (sum < 0) { 
        j++; 
      } else { 
        k--; 
      } 
    } 
  } 
  return result; 
}


public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		if (nums == null || nums.length < 3) {
			return result;
		}
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			int left = i + 1;
			int right = nums.length - 1;
			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				if (sum == 0) {
					List<Integer> list = new ArrayList<>();
					list.add(nums[i]);
					list.add(nums[left]);
					list.add(nums[right]);
					result.add(list);
					left++;
					right--;
					while (left < right && nums[left] == nums[left - 1]) {
						left++;
					}
					while (left < right && nums[right] == nums[right + 1]) {
						right--;
					}
				} else if (sum < 0) {
					left++;
				} else {
					right--;
				}
			}
		}
		return result;
	}


public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return result;
    }


public static List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 2; i++) {
        if (i == 0 || nums[i] != nums[i - 1]) {
            int low = i + 1;
            int high = nums.length - 1;
            int sum = 0 - nums[i];
            while (low < high) {
                if (nums[low] + nums[high] == sum) {
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    while (low < high && nums[low] == nums[low + 1]) {
                        low++;
                    }
                    while (low < high && nums[high] == nums[high - 1]) {
                        high--;
                    }
                    low++;
                    high--;
                } else if (nums[low] + nums[high] < sum) {
                    low++;
                } else {
                    high--;
                }
            }
        }
    }
    return result;
}


public static List<List<Integer>> findTriplets(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 2; i++) {
        if (i > 0 && nums[i] == nums[i - 1]) {
            continue;
        }
        int j = i + 1;
        int k = nums.length - 1;
        while (j < k) {
            int sum = nums[i] + nums[j] + nums[k];
            if (sum == 0) {
                result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                j++;
                k--;
                while (j < k && nums[j] == nums[j - 1]) {
                    j++;
                }
                while (j < k && nums[k] == nums[k + 1]) {
                    k--;
                }
            } else if (sum < 0) {
                j++;
            } else {
                k--;
            }
        }
    }
    return result;
}


public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums); //sort the array
    for (int i = 0; i < nums.length - 2; i++) {
        if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) { //skip the same numbers
            int low = i + 1;
            int high = nums.length - 1;
            int sum = 0 - nums[i];
            while (low < high) {
                if (nums[low] + nums[high] == sum) {
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    while (low < high && nums[low] == nums[low + 1]) {
                        low++;
                    }
                    while (low < high && nums[high] == nums[high - 1]) {
                        high--;
                    }
                    low++;
                    high--;
                } else if (nums[low] + nums[high] < sum) {
                    low++;
                } else {
                    high--;
                }
            }
        }
    }
    return result;
}


public static List<List<Integer>> findTriplets(int[] nums) {
    List<List<Integer>> triplets = new ArrayList<>();
    for (int i = 0; i < nums.length - 2; i++) {
        for (int j = i + 1; j < nums.length - 1; j++) {
            for (int k = j + 1; k < nums.length; k++) {
                if (nums[i] + nums[j] + nums[k] == 0 && i != j && i != k && j != k) {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);
                    triplets.add(triplet);
                }
            }
        }
    }
    return triplets;
}


public static List<List<Integer>> findTriplets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return result;
    }


public static List<List<Integer>> findTriplets(int[] nums) { 
    List<List<Integer>> triplets = new ArrayList<>();
    for (int i = 0; i < nums.length - 2; i++) {
        for (int j = i + 1; j < nums.length - 1; j++) {
            for (int k = j + 1; k < nums.length; k++) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);
                    triplets.add(triplet);
                }
            }
        }
    }
    return triplets;
}


public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();

    if (nums.length < 3)
        return result;

    Arrays.sort(nums);

    for (int i = 0; i < nums.length - 2; i++) {
        if (i > 0 && nums[i] == nums[i - 1])
            continue;

        int j = i + 1;
        int k = nums.length - 1;

        while (j < k) {
            int sum = nums[i] + nums[j] + nums[k];

            if (sum == 0) {
                result.add(Arrays.asList(nums[i], nums[j], nums[k]));

                while (j < k && nums[j] == nums[j + 1])
                    j++;
                while (j < k && nums[k] == nums[k - 1])
                    k--;

                j++;
                k--;
            } else if (sum > 0) {
                k--;
            } else {
                j++;
            }
        }
    }

    return result;
}


public List<List<Integer>> findTriplets(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    if (nums == null || nums.length < 3) {
        return result;
    }
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 2; i++) {
        if (i > 0 && nums[i] == nums[i - 1]) {
            continue;
        }
        int left = i + 1;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[i] + nums[left] + nums[right];
            if (sum == 0) {
                result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                left++;
                right--;
                while (left < right && nums[left] == nums[left - 1]) {
                    left++;
                }
                while (left < right && nums[right] == nums[right + 1]) {
                    right--;
                }
            } else if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }
    }
    return result;
}


public static List<List<Integer>> findTriplets(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums);
    
    for (int i = 0; i < nums.length - 2; i++) {
        if (i > 0 && nums[i] == nums[i - 1]) {
            continue;
        }
        
        int left = i + 1;
        int right = nums.length - 1;
        int target = 0 - nums[i];
        
        while (left < right) {
            if (nums[left] + nums[right] == target) {
                result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                left++;
                right--;
                while (left < right && nums[left] == nums[left - 1]) {
                    left++;
                }
                while (left < right && nums[right] == nums[right + 1]) {
                    right--;
                }
            } else if (nums[left] + nums[right] < target) {
                left++;
            } else {
                right--;
            }
        }
    }
    
    return result;
}


public static List<List<Integer>> findTriplets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return result;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return result;
    }


public static List<List<Integer>> findTriplets(int[] nums) {
  List<List<Integer>> result = new ArrayList<>();
  Arrays.sort(nums);
  for (int i = 0; i < nums.length - 2; i++) {
    if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
      int low = i + 1;
      int high = nums.length - 1;
      int sum = 0 - nums[i];
      while (low < high) {
        if (nums[low] + nums[high] == sum) {
          result.add(Arrays.asList(nums[i], nums[low], nums[high]));
          while (low < high && nums[low] == nums[low + 1]) low++;
          while (low < high && nums[high] == nums[high - 1]) high--;
          low++;
          high--;
        } else if (nums[low] + nums[high] < sum) {
          low++;
        } else {
          high--;
        }
      }
    }
  }
  return result;
}


public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 2; i++) {
        if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
            int low = i + 1;
            int high = nums.length - 1;
            int sum = 0 - nums[i];
            while (low < high) {
                if (nums[low] + nums[high] == sum) {
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    while (low < high && nums[low] == nums[low + 1]) low++;
                    while (low < high && nums[high] == nums[high - 1]) high--;
                    low++;
                    high--;
                } else if (nums[low] + nums[high] < sum) {
                    low++;
                } else {
                    high--;
                }
            }
        }
    }
    return result;
}


public static List<List<Integer>> findTriplets(int[] nums) {
    List<List<Integer>> triplets = new ArrayList<>();
    Arrays.sort(nums);

    for (int i = 0; i < nums.length - 2; i++) {
        if (i > 0 && nums[i] == nums[i - 1]) {
            continue;
        }

        int j = i + 1;
        int k = nums.length - 1;

        while (j < k) {
            int sum = nums[i] + nums[j] + nums[k];

            if (sum == 0) {
                triplets.add(Arrays.asList(nums[i], nums[j], nums[k]));
                j++;
                k--;
                while (j < k && nums[j] == nums[j - 1]) {
                    j++;
                }
                while (j < k && nums[k] == nums[k + 1]) {
                    k--;
                }
            } else if (sum > 0) {
                k--;
            } else {
                j++;
            }
        }
    }

    return triplets;
}


public static List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 2; i++) {
        if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
            int low = i + 1;
            int high = nums.length - 1;
            int sum = 0 - nums[i];
            while (low < high) {
                if (nums[low] + nums[high] == sum) {
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    while (low < high && nums[low] == nums[low + 1])
                        low++;
                    while (low < high && nums[high] == nums[high - 1])
                        high--;
                    low++;
                    high--;
                } else if (nums[low] + nums[high] > sum) {
                    high--;
                } else {
                    low++;
                }
            }
        }
    }
    return result;
}
