export interface Recipe {
    id: number;
    name: string;
    description: string;
    ingredients: Map<string, string>;
    instructions: string[];
    tags: Tag[];
}

export interface Tag {
    id: number;
    type: string;
    name: string;
    value: any;
}