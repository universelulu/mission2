package homework;

public class BookSearch {
	
	public static Book search_bs(Book[] books, int BookId)
	{
		int left;
		int right;
		
		while(left<=right)
		{
			int midIndex = (right-left) / 2;
			
			if(books[midIndex].GetId() == BookId)
			{
				return books[midIndex];
			}
			
			else if(books[midIndex].GetId() < BookId)
			{
				left++;
			}
			
			else
			{
				right--;
			}
		}
		
		return null; // 찾지 못하였으면 null 값 반환
	}

}
