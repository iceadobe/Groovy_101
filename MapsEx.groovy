class MapsEx    {
    static void main(String []args) 
    {
        def map = [
            'name': 'Himalaya',
            'age': 32,
            'address': [
                'city': 'Rohtak',
                'state': 'Haryana',
                'zipcode': 124001
            ],
            'contacts': [123, 234, 345, 456]
        ];
        println(map);
        
        map.put('newkey', 'newvalue');
        println(map.containsKey('newkey'));
        println(map.get('address'));
        println(map.size());
    }
}