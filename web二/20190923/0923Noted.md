###     字符串和数组

>    问题：往表格中加数据

>    1、如何表示各个单元格的信息

>    2、如何表示一条记录的信息？

#### 获得字符串的长度~length——str.length
#### 获得指定位置的字符~charAt——str.charAt（数字）;

#### 获取指定字符串首次出现的位置——str.indexOf(字符串)；
* 如果查找不到的话，返回值为-1
* 如果查找到的话，返回值为其位置（前边的空格不算）

#### 根据位置提取字符~slice——str.slice(start,end);
* 可以为负值
* slice(start,end);
          在字符串中截取子串
          指定截取的起始位置还有结束位置
  
          start和end可以为负值
          end结束位置可以缺省，缺省表示截取到字符串的结束位置
#### 用固定的字符串分隔~split
* 以特定的字符来分割字符串，得到子串
* 并将子串作为数组元素，存储到数组中
* str.split(分隔符号（标志）,分隔后得到的数组的长度)

#### 把字符串转换成大写的：str.toUpperCase();
#### 把字符串转换成小写的：str.toLowerCase();

#### huzyi

### 数组
* 数组的数组元素可以为任意的数据类型
* 记录多条数据类型~二维数组
* 数组的长度可变~可以动态的往数组中填充元素

            var arr=["red","blue","yellow"];
            arr[arr.length]="purple";
            
            console.log(arr);//["red", "blue", "yellow", "purple"]
            console.log(arr.length);//4          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          
          