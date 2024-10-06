## What are Streams ?
    - We can define Stream as a sequence of elements from a source that supports data
    processing opertations e.g. filter, map, limit, collect etc

### Stream vs Collections
    - The actual difference between collection and streams has to do with when thing are computed
    - A Collection is an in-memory data structure that holds all the values the data structure
    currently has and every element in the collection has to be computed before it can be added to 
    the collection
    - On the other hand, a Stream is conceptually fixed data structure whose elements are computed on 
    demand
    - We can think of Collection as a set values spread out in space. In contrast, Stream can be thougt
    as a set of values spread over time. Streams can be traversed only once. After that a stream is said to be consumed
    - Collection requires iteration done by user called external iteration e.g. - forEach etc. 
      Stream library by contrast uses internal iteration i.e. it does the iteration for us

### Intermediate vs Terminal operations
    - Stream operations that can be connected are called Intermediate operations e.g. filter, map, limit etc
    - Operations that closes a Stream are called Terminal Operation e.g. collect
    - Intermediate operations return another Stram as return type. On the other hand terminal oprations produce any
    non stream value such as List, Integer or even void(forEach) from a stream pipeline

### Short circuit operations
    - Operations that don't need to process the whole stream to produce results are refered as short circuit operations
    e.g. - fineAny, anyMatch, findFirst etc

### Stateless vs Stateful operations
    - Operations such as filter take each element from the input stream and produce a result. They don't need to maintain a 
    previous state for performing these ops. These kind of oprations are known as Stateless operations.
    - Some operations such as sorted, distinct require knowledge of previous history to do their job. These kind of ops are 
    are called Stateful operations. The storage requirement for such operations are unbounded. 